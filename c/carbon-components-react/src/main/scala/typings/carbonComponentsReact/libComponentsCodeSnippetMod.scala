package typings.carbonComponentsReact

import typings.carbonComponentsReact.libComponentsCodeSnippetCodeSnippetDotSkeletonMod.CodeSnippetSkeletonProps
import typings.carbonComponentsReact.libComponentsCodeSnippetCodeSnippetMod.CodeSnippetDivProps
import typings.carbonComponentsReact.libComponentsCodeSnippetCodeSnippetMod.CodeSnippetInlineProps
import typings.carbonComponentsReact.libComponentsCodeSnippetCodeSnippetMod.CodeSnippetMultiProps
import typings.carbonComponentsReact.typingsSharedMod.FCProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCodeSnippetMod {
  
  @JSImport("carbon-components-react/lib/components/CodeSnippet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable:unified-signatures
  inline def default(props: FCProps[CodeSnippetDivProps | CodeSnippetInlineProps | CodeSnippetMultiProps]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @JSImport("carbon-components-react/lib/components/CodeSnippet", "CodeSnippetSkeleton")
  @js.native
  val CodeSnippetSkeleton: FC[CodeSnippetSkeletonProps] = js.native
}
