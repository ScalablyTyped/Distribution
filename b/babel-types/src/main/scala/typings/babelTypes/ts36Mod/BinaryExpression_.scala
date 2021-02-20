package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.Ampersand
import typings.babelTypes.babelTypesStrings.Asterisk
import typings.babelTypes.babelTypesStrings.AsteriskAsterisk
import typings.babelTypes.babelTypesStrings.BinaryExpression
import typings.babelTypes.babelTypesStrings.EqualssignEqualssign
import typings.babelTypes.babelTypesStrings.EqualssignEqualssignEqualssign
import typings.babelTypes.babelTypesStrings.ExclamationmarkEqualssign
import typings.babelTypes.babelTypesStrings.ExclamationmarkEqualssignEqualssign
import typings.babelTypes.babelTypesStrings.Greaterthansign
import typings.babelTypes.babelTypesStrings.GreaterthansignEqualssign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.babelTypes.babelTypesStrings.Lessthansign
import typings.babelTypes.babelTypesStrings.LessthansignEqualssign
import typings.babelTypes.babelTypesStrings.LessthansignLessthansign
import typings.babelTypes.babelTypesStrings.Percentsign
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.Slash
import typings.babelTypes.babelTypesStrings.Verticalline
import typings.babelTypes.babelTypesStrings.`-_`
import typings.babelTypes.babelTypesStrings.in
import typings.babelTypes.babelTypesStrings.instanceof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryExpression_
  extends Node
     with Binary
     with Expression {
  
  var left: Expression = js.native
  
  var operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typings.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign = js.native
  
  var right: Expression = js.native
  
  @JSName("type")
  var type_BinaryExpression_ : BinaryExpression = js.native
}
object BinaryExpression_ {
  
  @scala.inline
  def apply(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typings.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    start: Double,
    `type`: BinaryExpression
  ): BinaryExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression_]
  }
  
  @scala.inline
  implicit class BinaryExpression_MutableBuilder[Self <: BinaryExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(
      value: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typings.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: BinaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
