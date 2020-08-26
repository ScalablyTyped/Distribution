package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExecuteOptions extends js.Object {
  /**
    * Whether to allow stdin requests.
    * The default is `true`.
    */
  var allow_stdin: js.UndefOr[Boolean] = js.native
  /**
    * Whether to execute the code as quietly as possible.
    * The default is `false`.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Whether to the abort execution queue on an error.
    * The default is `false`.
    */
  var stop_on_error: js.UndefOr[Boolean] = js.native
  /**
    * Whether to store history of the execution.
    * The default `true` if silent is False.
    * It is forced to  `false ` if silent is `true`.
    */
  var store_history: js.UndefOr[Boolean] = js.native
  /**
    * A mapping of names to expressions to be evaluated in the
    * kernel's interactive namespace.
    */
  var user_expressions: js.UndefOr[js.Object] = js.native
}

object IExecuteOptions {
  @scala.inline
  def apply(): IExecuteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExecuteOptions]
  }
  @scala.inline
  implicit class IExecuteOptionsOps[Self <: IExecuteOptions] (val x: Self) extends AnyVal {
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
    def setAllow_stdin(value: Boolean): Self = this.set("allow_stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_stdin: Self = this.set("allow_stdin", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setStop_on_error(value: Boolean): Self = this.set("stop_on_error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStop_on_error: Self = this.set("stop_on_error", js.undefined)
    @scala.inline
    def setStore_history(value: Boolean): Self = this.set("store_history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore_history: Self = this.set("store_history", js.undefined)
    @scala.inline
    def setUser_expressions(value: js.Object): Self = this.set("user_expressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_expressions: Self = this.set("user_expressions", js.undefined)
  }
  
}

