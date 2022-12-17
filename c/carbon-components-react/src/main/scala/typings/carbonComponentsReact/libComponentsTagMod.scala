package typings.carbonComponentsReact

import typings.carbonComponentsReact.libComponentsTagTagMod.ChipTagProps
import typings.carbonComponentsReact.libComponentsTagTagMod.FilterTagProps
import typings.carbonComponentsReact.libComponentsTagTagMod.TagTypeName
import typings.carbonComponentsReact.typingsSharedMod.FCProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTagMod {
  
  @JSImport("carbon-components-react/lib/components/Tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable:unified-signatures
  inline def default(props: FCProps[ChipTagProps | FilterTagProps]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @JSImport("carbon-components-react/lib/components/Tag", "types")
  @js.native
  val types: js.Array[TagTypeName] = js.native
}
