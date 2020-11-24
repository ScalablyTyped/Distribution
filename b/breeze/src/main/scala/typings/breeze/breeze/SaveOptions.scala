package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveOptions extends js.Object {
  
  var allowConcurrentSaves: Boolean = js.native
  
  var dataService: DataService = js.native
  
  var resourceName: String = js.native
  
  def setAsDefault(): SaveOptions = js.native
  
  var tag: js.Object = js.native
  
  def using(config: SaveOptionsConfiguration): SaveOptions = js.native
}
object SaveOptions {
  
  @scala.inline
  def apply(
    allowConcurrentSaves: Boolean,
    dataService: DataService,
    resourceName: String,
    setAsDefault: () => SaveOptions,
    tag: js.Object,
    using: SaveOptionsConfiguration => SaveOptions
  ): SaveOptions = {
    val __obj = js.Dynamic.literal(allowConcurrentSaves = allowConcurrentSaves.asInstanceOf[js.Any], dataService = dataService.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], setAsDefault = js.Any.fromFunction0(setAsDefault), tag = tag.asInstanceOf[js.Any], using = js.Any.fromFunction1(using))
    __obj.asInstanceOf[SaveOptions]
  }
  
  @scala.inline
  implicit class SaveOptionsOps[Self <: SaveOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowConcurrentSaves(value: Boolean): Self = this.set("allowConcurrentSaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataService(value: DataService): Self = this.set("dataService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsDefault(value: () => SaveOptions): Self = this.set("setAsDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTag(value: js.Object): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsing(value: SaveOptionsConfiguration => SaveOptions): Self = this.set("using", js.Any.fromFunction1(value))
  }
}
