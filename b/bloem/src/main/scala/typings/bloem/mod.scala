package typings.bloem

import typings.bloem.anon.Initialcapacity
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bloem", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def calculateSize(capacity: Double, error_rate: Double): Double = js.native
  
  def calculateSlices(size: Double, capacity: Double): Double = js.native
  
  @js.native
  class Bloem protected () extends js.Object {
    def this(size: Double, slices: Double, buffer: Buffer) = this()
    
    def add(key: Buffer): Unit = js.native
    
    def has(key: Buffer): Boolean = js.native
  }
  
  @js.native
  class SafeBloem protected () extends js.Object {
    def this(capacity: Double, error_rate: Double, buffer: Buffer) = this()
    
    def add(key: Buffer): Boolean = js.native
    
    def has(key: Buffer): Boolean = js.native
  }
  
  @js.native
  class ScalingBloem protected () extends js.Object {
    def this(error_rate: Double) = this()
    def this(error_rate: Double, options: Initialcapacity) = this()
    
    def add(key: Buffer): Unit = js.native
    
    def has(key: Buffer): Boolean = js.native
  }
}
