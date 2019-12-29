package typings.chayns.chayns

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * chayns.storage
  */
@JSGlobal("chayns.storage")
@js.native
object storage extends js.Object {
  @js.native
  sealed trait accessMode extends js.Object
  
  def get(key: String): js.Any = js.native
  def get(key: String, accessMode: accessMode): js.Any = js.native
  def remove(key: String): js.Promise[_] = js.native
  def remove(key: String, accessMode: accessMode): js.Promise[_] = js.native
  def set(key: String, value: js.Any): js.Promise[_] = js.native
  def set(key: String, value: js.Any, accessMode: accessMode): js.Promise[_] = js.native
  def set(key: String, value: js.Any, accessMode: accessMode, tappIds: js.Array[Double]): js.Promise[_] = js.native
  @js.native
  object accessMode extends js.Object {
    @js.native
    sealed trait PRIVATE extends accessMode
    
    @js.native
    sealed trait PROTECTED extends accessMode
    
    @js.native
    sealed trait PUBLIC extends accessMode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[accessMode with Double] = js.native
    /* 2 */ @js.native
    object PRIVATE extends TopLevel[PRIVATE with Double]
    
    /* 1 */ @js.native
    object PROTECTED extends TopLevel[PROTECTED with Double]
    
    /* 0 */ @js.native
    object PUBLIC extends TopLevel[PUBLIC with Double]
    
  }
  
}

