package typings.csstoolsPostcssMediaMinmax

import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformMod {
  
  @JSImport("@csstools/postcss-media-minmax/dist/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transform(mediaQueries: js.Array[MediaQuery]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(mediaQueries.asInstanceOf[js.Any]).asInstanceOf[String]
}
