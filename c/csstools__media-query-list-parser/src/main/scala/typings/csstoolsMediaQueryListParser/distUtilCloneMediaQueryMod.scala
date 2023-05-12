package typings.csstoolsMediaQueryListParser

import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryInvalid
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithType
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithoutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilCloneMediaQueryMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/util/clone-media-query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneMediaQuery(x: MediaQueryInvalid): MediaQueryInvalid = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneMediaQuery")(x.asInstanceOf[js.Any]).asInstanceOf[MediaQueryInvalid]
  inline def cloneMediaQuery(x: MediaQueryWithType): MediaQueryWithType = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneMediaQuery")(x.asInstanceOf[js.Any]).asInstanceOf[MediaQueryWithType]
  inline def cloneMediaQuery(x: MediaQueryWithoutType): MediaQueryWithoutType = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneMediaQuery")(x.asInstanceOf[js.Any]).asInstanceOf[MediaQueryWithoutType]
}
