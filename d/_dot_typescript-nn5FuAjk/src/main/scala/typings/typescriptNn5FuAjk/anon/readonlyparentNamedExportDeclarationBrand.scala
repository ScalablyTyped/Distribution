package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.mod.Decorator
import typings.typescriptNn5FuAjk.mod.Identifier
import typings.typescriptNn5FuAjk.mod.ModifiersArray
import typings.typescriptNn5FuAjk.mod.NamedExports
import typings.typescriptNn5FuAjk.mod.Node
import typings.typescriptNn5FuAjk.mod.NodeArray
import typings.typescriptNn5FuAjk.mod.NodeFlags
import typings.typescriptNn5FuAjk.mod.SourceFile
import typings.typescriptNn5FuAjk.mod.SourceFileLike
import typings.typescriptNn5FuAjk.mod.SyntaxKind.ExportSpecifier
import typings.typescriptNn5FuAjk.mod.TypeOnlyAliasDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined { readonly parent :.typescript-nn5FuAjk..typescript-nn5FuAjk.NamedExports & { readonly parent :.typescript-nn5FuAjk..typescript-nn5FuAjk.ExportDeclaration & { readonly isTypeOnly :true}}} & .typescript-nn5FuAjk..typescript-nn5FuAjk.ExportSpecifier */
@js.native
trait readonlyparentNamedExportDeclarationBrand
  extends StObject
     with TypeOnlyAliasDeclaration {
  
  var _declarationBrand: Any = js.native
  
  val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
  
  val end: Double = js.native
  
  val flags: NodeFlags = js.native
  
  def forEachChild[T](cbNode: js.Function1[/* node */ Node, js.UndefOr[T]]): js.UndefOr[T] = js.native
  def forEachChild[T](
    cbNode: js.Function1[/* node */ Node, js.UndefOr[T]],
    cbNodeArray: js.Function1[/* nodes */ NodeArray[Node], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  
  def getChildAt(index: Double): Node = js.native
  def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
  
  def getChildCount(): Double = js.native
  def getChildCount(sourceFile: SourceFile): Double = js.native
  
  def getChildren(): Array[Node] = js.native
  def getChildren(sourceFile: SourceFile): Array[Node] = js.native
  
  def getEnd(): Double = js.native
  
  def getFirstToken(): js.UndefOr[Node] = js.native
  def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  def getFullStart(): Double = js.native
  
  def getFullText(): String = js.native
  def getFullText(sourceFile: SourceFile): String = js.native
  
  def getFullWidth(): Double = js.native
  
  def getLastToken(): js.UndefOr[Node] = js.native
  def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  def getLeadingTriviaWidth(): Double = js.native
  def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
  
  def getSourceFile(): SourceFile = js.native
  
  def getStart(): Double = js.native
  def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
  def getStart(sourceFile: SourceFile): Double = js.native
  def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
  
  def getText(): String = js.native
  def getText(sourceFile: SourceFile): String = js.native
  
  def getWidth(): Double = js.native
  def getWidth(sourceFile: SourceFileLike): Double = js.native
  
  val isTypeOnly: Boolean = js.native
  
  val kind: ExportSpecifier = js.native
  
  val modifiers: js.UndefOr[ModifiersArray] = js.native
  
  val name: Identifier = js.native
  
  val parent: NamedExportsreadonlyparenDecorators & NamedExports = js.native
  
  val pos: Double = js.native
  
  val propertyName: js.UndefOr[Identifier] = js.native
}
