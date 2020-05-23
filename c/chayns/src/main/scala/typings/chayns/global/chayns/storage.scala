package typings.chayns.global.chayns

import typings.chayns.chayns.storage.accessMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * chayns.storage
  */
@JSGlobal("chayns.storage")
@js.native
object storage extends js.Object {
  def get(key: String): js.Any = js.native
  def get(key: String, accessMode: accessMode): js.Any = js.native
  def remove(key: String): js.Promise[_] = js.native
  def remove(key: String, accessMode: accessMode): js.Promise[_] = js.native
  def set(key: String, value: js.Any): js.Promise[_] = js.native
  def set(key: String, value: js.Any, accessMode: accessMode): js.Promise[_] = js.native
  def set(key: String, value: js.Any, accessMode: accessMode, tappIds: js.Array[Double]): js.Promise[_] = js.native
  @js.native
  object accessMode extends js.Object {
    /* 2 */ val PRIVATE: typings.chayns.chayns.storage.accessMode.PRIVATE with Double = js.native
    /* 1 */ val PROTECTED: typings.chayns.chayns.storage.accessMode.PROTECTED with Double = js.native
    /* 0 */ val PUBLIC: typings.chayns.chayns.storage.accessMode.PUBLIC with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.chayns.chayns.storage.accessMode with Double] = js.native
  }
  
}

