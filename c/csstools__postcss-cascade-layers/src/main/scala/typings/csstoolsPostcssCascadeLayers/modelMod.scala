package typings.csstoolsPostcssCascadeLayers

import typings.postcss.mod.AtRule_
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("@csstools/postcss-cascade-layers/dist/model", "Model")
  @js.native
  open class Model () extends StObject {
    
    def addLayerNameParts(parts: String): Unit = js.native
    def addLayerNameParts(parts: js.Array[String]): Unit = js.native
    
    def addLayerParams(key: String): Unit = js.native
    def addLayerParams(key: String, parts: String): Unit = js.native
    def addLayerParams(key: String, parts: js.Array[String]): Unit = js.native
    
    var anonymousLayerCount: Double = js.native
    
    def createAnonymousLayerName(): String = js.native
    
    def createImplicitLayerName(layerName: String): String = js.native
    
    def getLayerNameList(layerName: String): js.Array[String] = js.native
    
    def getLayerParams(layer: AtRule_): js.Array[String] = js.native
    
    var layerCount: Double = js.native
    
    var layerNameParts: Map[String, js.Array[String]] = js.native
    
    var layerOrder: Map[String, Double] = js.native
    
    var layerParamsParsed: Map[String, js.Array[String]] = js.native
    
    def sortLayerNames(): Unit = js.native
  }
}
