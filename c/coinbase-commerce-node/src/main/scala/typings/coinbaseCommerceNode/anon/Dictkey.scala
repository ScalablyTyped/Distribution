package typings.coinbaseCommerceNode.anon

import org.scalablytyped.runtime.StringDictionary
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.applicationSlashjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var Accept: applicationSlashjson = js.native
  var `Content-Type`: applicationSlashjson = js.native
  var `User-Agent`: String = js.native
  var `X-CC-Api-Key`: String = js.native
  var `X-CC-Version`: String = js.native
}

object Dictkey {
  @scala.inline
  def apply(
    Accept: applicationSlashjson,
    `Content-Type`: applicationSlashjson,
    `User-Agent`: String,
    `X-CC-Api-Key`: String,
    `X-CC-Version`: String
  ): Dictkey = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any])
    __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-CC-Api-Key")(`X-CC-Api-Key`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-CC-Version")(`X-CC-Version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
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
    def setAccept(value: applicationSlashjson): Self = this.set("Accept", value.asInstanceOf[js.Any])
    @scala.inline
    def `setContent-Type`(value: applicationSlashjson): Self = this.set("Content-Type", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUser-Agent`(value: String): Self = this.set("User-Agent", value.asInstanceOf[js.Any])
    @scala.inline
    def `setX-CC-Api-Key`(value: String): Self = this.set("X-CC-Api-Key", value.asInstanceOf[js.Any])
    @scala.inline
    def `setX-CC-Version`(value: String): Self = this.set("X-CC-Version", value.asInstanceOf[js.Any])
  }
  
}

