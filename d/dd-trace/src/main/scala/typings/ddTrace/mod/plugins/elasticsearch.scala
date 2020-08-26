package typings.ddTrace.mod.plugins

import typings.ddTrace.anon.Query
import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [elasticsearch](https://github.com/elastic/elasticsearch-js) module.
  */
@js.native
trait elasticsearch
  extends Integration
     with Analyzable {
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[Query] = js.native
}

object elasticsearch {
  @scala.inline
  def apply(): elasticsearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[elasticsearch]
  }
  @scala.inline
  implicit class elasticsearchOps[Self <: elasticsearch] (val x: Self) extends AnyVal {
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
    def setHooks(value: Query): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
  }
  
}

