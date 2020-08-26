package typings.chromeApps.anon

import typings.chromeApps.chrome.dns.ResolveCallbackResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdns extends js.Object {
  /**
    * Resolves the given hostname or IP address literal.
    * @param hostname The hostname to resolve.
    * @param callback Called when the resolution operation completes.
    */
  def resolve(hostname: String, callback: js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]): Unit = js.native
}

object Typeofdns {
  @scala.inline
  def apply(resolve: (String, js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]) => Unit): Typeofdns = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2(resolve))
    __obj.asInstanceOf[Typeofdns]
  }
  @scala.inline
  implicit class TypeofdnsOps[Self <: Typeofdns] (val x: Self) extends AnyVal {
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
    def setResolve(value: (String, js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]) => Unit): Self = this.set("resolve", js.Any.fromFunction2(value))
  }
  
}

