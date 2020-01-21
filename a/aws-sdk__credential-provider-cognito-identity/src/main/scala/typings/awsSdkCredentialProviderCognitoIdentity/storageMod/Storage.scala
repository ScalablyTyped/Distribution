package typings.awsSdkCredentialProviderCognitoIdentity.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  def getItem(key: String): String | Null | (js.Promise[String | Null])
  def removeItem(key: String): Unit | js.Promise[Unit]
  def setItem(key: String, data: String): Unit | js.Promise[Unit]
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
}

