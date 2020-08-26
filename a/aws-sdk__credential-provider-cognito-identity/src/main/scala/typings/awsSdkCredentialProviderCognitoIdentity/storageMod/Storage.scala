package typings.awsSdkCredentialProviderCognitoIdentity.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  def getItem(key: String): String | Null | (js.Promise[String | Null]) = js.native
  def removeItem(key: String): Unit | js.Promise[Unit] = js.native
  def setItem(key: String, data: String): Unit | js.Promise[Unit] = js.native
}

object Storage {
  @scala.inline
  def apply(
    getItem: String => String | Null | (js.Promise[String | Null]),
    removeItem: String => Unit | js.Promise[Unit],
    setItem: (String, String) => Unit | js.Promise[Unit]
  ): Storage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetItem(value: String => String | Null | (js.Promise[String | Null])): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveItem(value: String => Unit | js.Promise[Unit]): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSetItem(value: (String, String) => Unit | js.Promise[Unit]): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
  
}

