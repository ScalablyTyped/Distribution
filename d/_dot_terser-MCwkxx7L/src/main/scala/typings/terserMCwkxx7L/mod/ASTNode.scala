package typings.terserMCwkxx7L.mod

import typings.std.Record
import typings.terserMCwkxx7L.anon.TypeofASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".terser-MCwkxx7L", "AST_Node")
@js.native
open class ASTNode () extends StObject {
  def this(props: js.Object) = this()
  
  var CTOR: TypeofASTNode = js.native
  
  var TYPE: String = js.native
  
  def print_to_string(): String = js.native
  def print_to_string(options: OutputOptions): String = js.native
  
  def transform(tt: TreeTransformer): ASTNode = js.native
  def transform(tt: TreeTransformer, in_list: Boolean): ASTNode = js.native
  
  def walk(visitor: TreeWalker): Unit = js.native
}
/* static members */
object ASTNode {
  
  @JSImport(".terser-MCwkxx7L", "AST_Node")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".terser-MCwkxx7L", "AST_Node.BASE")
  @js.native
  def BASE: js.UndefOr[ASTNode] = js.native
  inline def BASE_=(x: js.UndefOr[ASTNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE")(x.asInstanceOf[js.Any])
  
  @JSImport(".terser-MCwkxx7L", "AST_Node.PROPS")
  @js.native
  def PROPS: js.Array[String] = js.native
  inline def PROPS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROPS")(x.asInstanceOf[js.Any])
  
  @JSImport(".terser-MCwkxx7L", "AST_Node.SELF_PROPS")
  @js.native
  def SELF_PROPS: js.Array[String] = js.native
  inline def SELF_PROPS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELF_PROPS")(x.asInstanceOf[js.Any])
  
  @JSImport(".terser-MCwkxx7L", "AST_Node.SUBCLASSES")
  @js.native
  def SUBCLASSES: js.Array[ASTNode] = js.native
  inline def SUBCLASSES_=(x: js.Array[ASTNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBCLASSES")(x.asInstanceOf[js.Any])
  
  @JSImport(".terser-MCwkxx7L", "AST_Node.documentation")
  @js.native
  def documentation: String = js.native
  inline def documentation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("documentation")(x.asInstanceOf[js.Any])
  
  @JSImport(".terser-MCwkxx7L", "AST_Node.expressions")
  @js.native
  def expressions: js.UndefOr[js.Array[ASTNode]] = js.native
  inline def expressions_=(x: js.UndefOr[js.Array[ASTNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expressions")(x.asInstanceOf[js.Any])
  
  @JSImport(".terser-MCwkxx7L", "AST_Node.from_mozilla_ast")
  @js.native
  def from_mozilla_ast: js.UndefOr[js.Function1[/* node */ this.type, Any]] = js.native
  inline def from_mozilla_ast_=(x: js.UndefOr[js.Function1[/* node */ this.type, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from_mozilla_ast")(x.asInstanceOf[js.Any])
  
  @JSImport(".terser-MCwkxx7L", "AST_Node.propdoc")
  @js.native
  def propdoc: js.UndefOr[Record[String, String]] = js.native
  inline def propdoc_=(x: js.UndefOr[Record[String, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propdoc")(x.asInstanceOf[js.Any])
  
  @JSImport(".terser-MCwkxx7L", "AST_Node.warn")
  @js.native
  def warn: js.UndefOr[js.Function2[/* text */ String, /* props */ Any, Unit]] = js.native
  inline def warn_=(x: js.UndefOr[js.Function2[/* text */ String, /* props */ Any, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
}
