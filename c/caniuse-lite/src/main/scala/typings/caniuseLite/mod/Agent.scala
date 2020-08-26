package typings.caniuseLite.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agent extends js.Object {
  /**
    * The agent's name
    */
  var browser: String = js.native
  /**
    * The agents vendor prefix
    */
  var prefix: String = js.native
  /**
    * Exceptions to vendor prefix use.
    */
  var prefix_exceptions: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  /**
    * Release dates as seconds since epoch by version.
    */
  var release_date: StringDictionary[js.UndefOr[Double]] = js.native
  /**
    * Global agent usage by version
    */
  var usage_global: UsageByVersion = js.native
  /**
    * Version matrix. See [caniuse](https://caniuse.com)
    */
  var versions: js.Array[js.Any] = js.native
}

object Agent {
  @scala.inline
  def apply(
    browser: String,
    prefix: String,
    release_date: StringDictionary[js.UndefOr[Double]],
    usage_global: UsageByVersion,
    versions: js.Array[js.Any]
  ): Agent = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], usage_global = usage_global.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agent]
  }
  @scala.inline
  implicit class AgentOps[Self <: Agent] (val x: Self) extends AnyVal {
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
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease_date(value: StringDictionary[js.UndefOr[Double]]): Self = this.set("release_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsage_global(value: UsageByVersion): Self = this.set("usage_global", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionsVarargs(value: js.Any*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[js.Any]): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix_exceptions(value: StringDictionary[js.UndefOr[String]]): Self = this.set("prefix_exceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix_exceptions: Self = this.set("prefix_exceptions", js.undefined)
  }
  
}

