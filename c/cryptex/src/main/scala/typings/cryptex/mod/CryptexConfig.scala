package typings.cryptex.mod

import typings.cryptex.anon.DataKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptexConfig extends js.Object {
  var algorithm: js.UndefOr[String] = js.native
  var keySource: String = js.native
  var keySourceOpts: js.UndefOr[DataKey] = js.native
  var secretEncoding: js.UndefOr[String] = js.native
  var secrets: js.Object = js.native
}

object CryptexConfig {
  @scala.inline
  def apply(keySource: String, secrets: js.Object): CryptexConfig = {
    val __obj = js.Dynamic.literal(keySource = keySource.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptexConfig]
  }
  @scala.inline
  implicit class CryptexConfigOps[Self <: CryptexConfig] (val x: Self) extends AnyVal {
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
    def setKeySource(value: String): Self = this.set("keySource", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecrets(value: js.Object): Self = this.set("secrets", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setKeySourceOpts(value: DataKey): Self = this.set("keySourceOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySourceOpts: Self = this.set("keySourceOpts", js.undefined)
    @scala.inline
    def setSecretEncoding(value: String): Self = this.set("secretEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretEncoding: Self = this.set("secretEncoding", js.undefined)
  }
  
}

