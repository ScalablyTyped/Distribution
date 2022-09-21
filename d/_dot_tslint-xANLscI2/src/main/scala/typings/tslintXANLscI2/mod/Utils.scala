package typings.tslintXANLscI2.mod

import typings.node.bufferMod.global.Buffer
import typings.std.TemplateStringsArray
import typings.tslintXANLscI2.utilsDotDTsMod.Encoding
import typings.tslintXANLscI2.utilsDotDTsMod.Equal
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utils {
  
  @JSImport(".tslint-xANLscI2", "Utils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayify[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")().asInstanceOf[js.Array[T]]
  inline def arrayify[T](arg: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrayify[T](arg: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def arraysAreEqual[T](a: js.Array[T], b: js.Array[T], eq: Equal[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysAreEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arraysAreEqual[T](a: js.Array[T], b: Unit, eq: Equal[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysAreEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arraysAreEqual[T](a: Unit, b: js.Array[T], eq: Equal[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysAreEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arraysAreEqual[T](a: Unit, b: Unit, eq: Equal[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysAreEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def camelize(stringWithHyphens: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(stringWithHyphens.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dedent(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dedent")(List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def denormalizeWinPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("denormalizeWinPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def detectBufferEncoding(buffer: Buffer): Encoding = ^.asInstanceOf[js.Dynamic].applyDynamic("detectBufferEncoding")(buffer.asInstanceOf[js.Any]).asInstanceOf[Encoding]
  inline def detectBufferEncoding(buffer: Buffer, length: Double): Encoding = (^.asInstanceOf[js.Dynamic].applyDynamic("detectBufferEncoding")(buffer.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Encoding]
  
  inline def escapeRegExp(re: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegExp")(re.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def find[T, U](inputs: js.Array[T], getResult: js.Function1[/* t */ T, js.UndefOr[U]]): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(inputs.asInstanceOf[js.Any], getResult.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
  
  inline def flatMap[T, U](inputs: js.Array[T], getOutputs: js.Function2[/* input */ T, /* index */ Double, js.Array[U]]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(inputs.asInstanceOf[js.Any], getOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def getIndentation(node: Node, sourceFile: SourceFile): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndentation")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hasOwnProperty_(arg: js.Object, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(arg.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCamelCased(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCamelCased")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunctionScopeBoundary(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKebabCased(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKebabCased")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLowerCase(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowerCase")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPascalCased(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPascalCased")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSnakeCased(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSnakeCased")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUpperCase(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUpperCase")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mapDefined[T, U](inputs: js.Array[T], getOutput: js.Function1[/* input */ T, js.UndefOr[U]]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapDefined")(inputs.asInstanceOf[js.Any], getOutput.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def newLineWithIndentation(node: Node, sourceFile: SourceFile): String = (^.asInstanceOf[js.Dynamic].applyDynamic("newLineWithIndentation")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def newLineWithIndentation(node: Node, sourceFile: SourceFile, linesCount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("newLineWithIndentation")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], linesCount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def objectify(arg: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("objectify")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def readBufferWithDetectedEncoding(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readBufferWithDetectedEncoding")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripComments(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripComments")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trimSingleQuotes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimSingleQuotes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tryResolvePackage(packageName: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryResolvePackage")(packageName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def tryResolvePackage(packageName: String, relativeTo: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryResolvePackage")(packageName.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
