package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnparsedSource
  extends StObject
     with Node {
  
  var fileName: java.lang.String = js.native
  
  var hasNoDefaultLib: js.UndefOr[Boolean] = js.native
  
  var helpers: js.UndefOr[Array[UnscopedEmitHelper]] = js.native
  
  @JSName("kind")
  val kind_UnparsedSource: typings.typescriptNn5FuAjk.ts.SyntaxKind.UnparsedSource = js.native
  
  var libReferenceDirectives: Array[FileReference] = js.native
  
  val prologues: Array[UnparsedPrologue] = js.native
  
  var referencedFiles: Array[FileReference] = js.native
  
  var sourceMapPath: js.UndefOr[java.lang.String] = js.native
  
  var sourceMapText: js.UndefOr[java.lang.String] = js.native
  
  val syntheticReferences: js.UndefOr[Array[UnparsedSyntheticReference]] = js.native
  
  var text: java.lang.String = js.native
  
  val texts: Array[UnparsedSourceText] = js.native
  
  var typeReferenceDirectives: js.UndefOr[Array[FileReference]] = js.native
}
