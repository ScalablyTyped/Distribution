package typings.bizcharts.mod

import typings.antvG2.mod.BashView
import typings.antvG2.mod.DomUtil
import typings.antvG2.mod.Global
import typings.antvG2.mod.MatrixUtil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * origin G2
  **/
trait G2 extends StObject {
  
  var Animate: typings.antvG2.mod.Animate
  
  var Chart: typings.antvG2.mod.Chart
  
  var DomUtil: typings.antvG2.mod.DomUtil
  
  var G: js.Any
  
  var Global: typings.antvG2.mod.Global
  
  var MatrixUtil: typings.antvG2.mod.MatrixUtil
  
  var PathUtil: typings.antvG2.mod.PathUtil
  
  var Shape: BashView
  
  var Util: typings.antvG2.mod.Util
  
  def track(enable: Boolean): Unit
  
  var version: String
}
object G2 {
  
  @JSImport("bizcharts", "G2")
  @js.native
  val ^ : G2 = js.native
  
  @scala.inline
  implicit class G2MutableBuilder[Self <: G2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: typings.antvG2.mod.Animate): Self = StObject.set(x, "Animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: typings.antvG2.mod.Chart): Self = StObject.set(x, "Chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomUtil(value: DomUtil): Self = StObject.set(x, "DomUtil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: js.Any): Self = StObject.set(x, "G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: Global): Self = StObject.set(x, "Global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixUtil(value: MatrixUtil): Self = StObject.set(x, "MatrixUtil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUtil(value: typings.antvG2.mod.PathUtil): Self = StObject.set(x, "PathUtil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: BashView): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: Boolean => Unit): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUtil(value: typings.antvG2.mod.Util): Self = StObject.set(x, "Util", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
