package typings.blackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectPoolMod {
  
  @JSImport("black-engine/utils/ObjectPool", "ObjectPool")
  @js.native
  open class ObjectPool protected () extends StObject {
    def this(`type`: js.Function0[Unit]) = this()
    def this(`type`: js.Function0[Unit], capacity: Double) = this()
    
    def capacity: Double = js.native
    def capacity_=(arg: Double): Unit = js.native
    
    def get(): Any = js.native
    
    var mCapacity: Double = js.native
    
    var mReleased: js.Array[Any] = js.native
    
    def mType(): Unit = js.native
    
    def release(`object`: Any): Unit = js.native
    
    def releaseAll(): Unit = js.native
  }
}
