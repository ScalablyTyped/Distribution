package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Decorator
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ExportDeclaration
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ExportSpecifier
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModifiersArray
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Node
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.NodeArray
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.NodeFlags
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SourceFile
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SourceFileLike
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.NamedExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined .typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.NamedExports & { readonly parent :.typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.ExportDeclaration & { readonly isTypeOnly :true}} */
@js.native
trait NamedExportsreadonlyparen extends StObject {
  
  val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
  
  val elements: NodeArray[ExportSpecifier] = js.native
  
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
  
  val kind: NamedExports = js.native
  
  val modifiers: js.UndefOr[ModifiersArray] = js.native
  
  val parent: ExportDeclaration & ExportDeclarationreadonly = js.native
  
  val pos: Double = js.native
}
