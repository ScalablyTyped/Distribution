package typings.bloem

import typings.bloem.anon.Initialcapacity
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bloem", "Bloem")
  @js.native
  class Bloem protected () extends StObject {
    def this(size: Double, slices: Double, buffer: Buffer) = this()
    
    def add(key: Buffer): Unit = js.native
    
    def has(key: Buffer): Boolean = js.native
  }
  
  @JSImport("bloem", "SafeBloem")
  @js.native
  class SafeBloem protected () extends StObject {
    def this(capacity: Double, error_rate: Double, buffer: Buffer) = this()
    
    def add(key: Buffer): Boolean = js.native
    
    def has(key: Buffer): Boolean = js.native
  }
  
  @JSImport("bloem", "ScalingBloem")
  @js.native
  class ScalingBloem protected () extends StObject {
    def this(error_rate: Double) = this()
    def this(error_rate: Double, options: Initialcapacity) = this()
    
    def add(key: Buffer): Unit = js.native
    
    def has(key: Buffer): Boolean = js.native
  }
  
  @JSImport("bloem", "calculateSize")
  @js.native
  def calculateSize(capacity: Double, error_rate: Double): Double = js.native
  
  @JSImport("bloem", "calculateSlices")
  @js.native
  def calculateSlices(size: Double, capacity: Double): Double = js.native
}
