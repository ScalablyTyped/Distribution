package typings.regjsparser8A6ZFEHp.mod

import typings.regjsparser8A6ZFEHp.anon.Behavior
import typings.regjsparser8A6ZFEHp.anon.Name
import typings.regjsparser8A6ZFEHp.anon.NameUndefined
import typings.regjsparser8A6ZFEHp.mod.^
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.dot
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.group
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def parse[F /* <: Features */](str: String, flags: String): RootNode[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[RootNode[F]]
inline def parse[F /* <: Features */](str: String, flags: String, features: F): RootNode[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[RootNode[F]]

/* Rewritten from type alias, can be one of: 
  - typings.regjsparser8A6ZFEHp.mod.Alternative[F]
  - typings.regjsparser8A6ZFEHp.mod.Anchor
  - typings.regjsparser8A6ZFEHp.mod.CharacterClass[F]
  - typings.regjsparser8A6ZFEHp.mod.CharacterClassEscape
  - typings.regjsparser8A6ZFEHp.mod.CharacterClassRange
  - typings.regjsparser8A6ZFEHp.mod.Disjunction[F]
  - typings.regjsparser8A6ZFEHp.mod.Dot
  - typings.regjsparser8A6ZFEHp.mod.Group[F]
  - typings.regjsparser8A6ZFEHp.mod.Quantifier[F]
  - typings.regjsparser8A6ZFEHp.mod.Reference[F]
  - typings.regjsparser8A6ZFEHp.mod.If[
/ * import warning: importer.ImportType#apply Failed type conversion: F['unicodePropertyEscape'] * / js.Any, 
typings.regjsparser8A6ZFEHp.mod.UnicodePropertyEscape, 
scala.Nothing]
  - typings.regjsparser8A6ZFEHp.mod.Value
*/
type AstNode[F /* <: Features */] = _AstNode[F] | (If[
/* import warning: importer.ImportType#apply Failed type conversion: F['unicodePropertyEscape'] */ js.Any, 
UnicodePropertyEscape, 
scala.Nothing]) | Dot | Group[F] | Reference[F]

type CapturingGroup[F /* <: Features */] = Base[group] & Behavior[F] & (If[
/* import warning: importer.ImportType#apply Failed type conversion: F['namedGroups'] */ js.Any, 
Name, 
NameUndefined])

type Dot = Base[dot]

type Group[F /* <: Features */] = CapturingGroup[F] | NonCapturingGroup[F]

type If[Test, Then, Else] = Else | Then

type Reference[F /* <: Features */] = If[
/* import warning: importer.ImportType#apply Failed type conversion: F['namedGroups'] */ js.Any, 
NamedReference, 
IndexReference]

type RootNode[F /* <: Features */] = Exclude[AstNode[F], CharacterClassRange]
