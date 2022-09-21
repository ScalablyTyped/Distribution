package typings.carbonComponentsReact

import typings.carbonComponentsReact.codeSnippetCodeSnippetMod.CodeSnippetDivProps
import typings.carbonComponentsReact.codeSnippetCodeSnippetMod.CodeSnippetInlineProps
import typings.carbonComponentsReact.codeSnippetCodeSnippetMod.CodeSnippetMultiProps
import typings.carbonComponentsReact.codeSnippetSkeletonMod.CodeSnippetSkeletonProps
import typings.carbonComponentsReact.typingsSharedMod.FCProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeSnippetMod {
  
  @JSImport("carbon-components-react/lib/components/CodeSnippet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable:unified-signatures
  inline def default(props: FCProps[CodeSnippetDivProps | CodeSnippetInlineProps | CodeSnippetMultiProps]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @JSImport("carbon-components-react/lib/components/CodeSnippet", "CodeSnippetSkeleton")
  @js.native
  val CodeSnippetSkeleton: FC[CodeSnippetSkeletonProps] = js.native
}
