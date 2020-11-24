package typings.broccoliPlugin.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginOptions extends js.Object {
  
  /**
    * A descriptive annotation. Useful for debugging, to tell multiple instances of the same plugin apart.
    */
  var annotation: js.UndefOr[String] = js.native
  
  /**
    * The name of this plugin class. Defaults to this.constructor.name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If true, a cache directory is created automatically and the path is set at cachePath.
    * If false, a cache directory is not created and this.cachePath is undefined. Defaults to true
    */
  var needsCache: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the output directory is not automatically emptied between builds.
    */
  var persistentOutput: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, a change object will be passed to the build method which contains
    * information about which input has changed since the last build. Defaults to false.
    */
  var trackInputChanges: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, memoization will not be applied and the build method will always be called regardless if the inputNodes have changed. Defaults to false.
    */
  var volatile: js.UndefOr[Boolean] = js.native
}
object PluginOptions {
  
  @scala.inline
  def apply(): PluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginOptions]
  }
  
  @scala.inline
  implicit class PluginOptionsOps[Self <: PluginOptions] (val x: Self) extends AnyVal {
    
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
    def setAnnotation(value: String): Self = this.set("annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotation: Self = this.set("annotation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNeedsCache(value: Boolean): Self = this.set("needsCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedsCache: Self = this.set("needsCache", js.undefined)
    
    @scala.inline
    def setPersistentOutput(value: Boolean): Self = this.set("persistentOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentOutput: Self = this.set("persistentOutput", js.undefined)
    
    @scala.inline
    def setTrackInputChanges(value: Boolean): Self = this.set("trackInputChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackInputChanges: Self = this.set("trackInputChanges", js.undefined)
    
    @scala.inline
    def setVolatile(value: Boolean): Self = this.set("volatile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolatile: Self = this.set("volatile", js.undefined)
  }
}
