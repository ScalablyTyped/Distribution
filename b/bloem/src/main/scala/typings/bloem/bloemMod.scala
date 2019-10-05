package typings.bloem

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bloem", JSImport.Namespace)
@js.native
object bloemMod extends js.Object {
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
    def this(error_rate: Double, options: Anon_Initialcapacity) = this()
    def add(key: Buffer): Unit = js.native
    def has(key: Buffer): Boolean = js.native
  }
  
  def calculateSize(capacity: Double, error_rate: Double): Double = js.native
  def calculateSlices(size: Double, capacity: Double): Double = js.native
}

