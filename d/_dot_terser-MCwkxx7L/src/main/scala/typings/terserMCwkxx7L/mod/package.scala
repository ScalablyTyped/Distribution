package typings.terserMCwkxx7L.mod

import org.scalablytyped.runtime.StringDictionary
import typings.terserMCwkxx7L.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def minify(files: String): MinifyOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[MinifyOutput]
inline def minify(files: String, options: MinifyOptions): MinifyOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MinifyOutput]
inline def minify(files: js.Array[String]): MinifyOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[MinifyOutput]
inline def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MinifyOutput]
inline def minify(files: StringDictionary[String]): MinifyOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[MinifyOutput]
inline def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MinifyOutput]
inline def minify(files: ASTNode): MinifyOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[MinifyOutput]
inline def minify(files: ASTNode, options: MinifyOptions): MinifyOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MinifyOutput]

inline def pushUniq[T](array: js.Array[T], el: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push_uniq")(array.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]

type ASTAccessor = ASTLambda

type ASTArrow = ASTLambda

type ASTAssign = ASTBinary

type ASTAtom = ASTConstant

type ASTBlockStatement = ASTBlock

type ASTBoolean = ASTAtom

type ASTBreak = ASTLoopControl

type ASTClassExpression = ASTClass

type ASTConst = ASTDefinitions

type ASTConstant = ASTNode

type ASTContinue = ASTLoopControl

type ASTDebugger = ASTStatement

type ASTDefClass = ASTClass

type ASTDefault = ASTSwitchBranch

type ASTDefaultAssign = ASTBinary

type ASTDefun = ASTLambda

type ASTDo = ASTDWLoop

type ASTDot = ASTPropAccess

type ASTEmptyStatement = ASTStatement

type ASTFalse = ASTBoolean

type ASTFinally = ASTBlock

type ASTFunction = ASTLambda

type ASTHole = ASTAtom

type ASTInfinity = ASTAtom

type ASTJump = ASTStatement

type ASTLabelRef = ASTSymbol

type ASTLet = ASTDefinitions

type ASTNaN = ASTAtom

type ASTNew = ASTCall

type ASTNewTarget = ASTNode

type ASTNull = ASTAtom

type ASTReturn = ASTExit

type ASTStatement = ASTNode

type ASTSub = ASTPropAccess

type ASTSuper = ASTThis

type ASTSwitchBranch = ASTBlock

type ASTSymbolBlockDeclaration = ASTSymbolDeclaration

type ASTSymbolCatch = ASTSymbolBlockDeclaration

type ASTSymbolClass = ASTSymbolDeclaration

type ASTSymbolConst = ASTSymbolBlockDeclaration

type ASTSymbolDefClass = ASTSymbolBlockDeclaration

type ASTSymbolDefun = ASTSymbolDeclaration

type ASTSymbolExport = ASTSymbolRef

type ASTSymbolExportForeign = ASTSymbol

type ASTSymbolFunarg = ASTSymbolVar

type ASTSymbolImport = ASTSymbolBlockDeclaration

type ASTSymbolImportForeign = ASTSymbol

type ASTSymbolLambda = ASTSymbolDeclaration

type ASTSymbolLet = ASTSymbolBlockDeclaration

type ASTSymbolMethod = ASTSymbol

type ASTSymbolRef = ASTSymbol

type ASTSymbolVar = ASTSymbolDeclaration

type ASTThis = ASTSymbol

type ASTThrow = ASTExit

type ASTTrue = ASTBoolean

type ASTUnaryPostfix = ASTUnary

type ASTUnaryPrefix = ASTUnary

type ASTUndefined = ASTAtom

type ASTVar = ASTDefinitions

type ASTWhile = ASTDWLoop

/* Rewritten from type alias, can be one of: 
  - typings.terserMCwkxx7L.mod.ASTSymbolFunarg
  - typings.terserMCwkxx7L.mod.ASTDefaultAssign
  - typings.terserMCwkxx7L.mod.ASTDestructuring
  - typings.terserMCwkxx7L.mod.ASTExpansion
*/
type ArgType = _ArgType | ASTSymbolFunarg | ASTDefaultAssign
