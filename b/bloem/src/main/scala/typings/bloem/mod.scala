package typings.bloem

import typings.bloem.anon.Initialcapacity
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bloem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bloem", "Bloem")
  @js.native
  open class Bloem protected () extends StObject {
    def this(size: Double, slices: Double, buffer: Buffer) = this()
    
    def add(key: Buffer): Unit = js.native
    
    def has(key: Buffer): Boolean = js.native
  }
  
  @JSImport("bloem", "SafeBloem")
  @js.native
  open class SafeBloem protected () extends StObject {
    def this(capacity: Double, error_rate: Double, buffer: Buffer) = this()
    
    def add(key: Buffer): Boolean = js.native
    
    def has(key: Buffer): Boolean = js.native
  }
  
  @JSImport("bloem", "ScalingBloem")
  @js.native
  open class ScalingBloem protected () extends StObject {
    def this(error_rate: Double) = this()
    def this(error_rate: Double, options: Initialcapacity) = this()
    
    def add(key: Buffer): Unit = js.native
    
    def has(key: Buffer): Boolean = js.native
  }
  
  inline def calculateSize(capacity: Double, error_rate: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateSize")(capacity.asInstanceOf[js.Any], error_rate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def calculateSlices(size: Double, capacity: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateSlices")(size.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[Double]
}
