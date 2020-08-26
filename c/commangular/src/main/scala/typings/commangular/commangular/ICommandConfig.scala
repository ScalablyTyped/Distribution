package typings.commangular.commangular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Command creation configuration
  * see http://commangular.org/docs/#the-command-config-object
  */
@js.native
trait ICommandConfig extends js.Object {
  /**
    * This property instruct commangular to keep the value returned by the command in the value
    * key passed in 'resultKey'. It has to be a string. It means that after the execution of this
    * commands you will be able to inject on the next command using that key and the result of the command will be injected.
    */
  var resultKey: String = js.native
}

object ICommandConfig {
  @scala.inline
  def apply(resultKey: String): ICommandConfig = {
    val __obj = js.Dynamic.literal(resultKey = resultKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandConfig]
  }
  @scala.inline
  implicit class ICommandConfigOps[Self <: ICommandConfig] (val x: Self) extends AnyVal {
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
    def setResultKey(value: String): Self = this.set("resultKey", value.asInstanceOf[js.Any])
  }
  
}

