package typings.babelPresetEnv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var bugfixes: js.UndefOr[Boolean] = js.native
  
  var configPath: js.UndefOr[String] = js.native
  
  var corejs: js.UndefOr[CorejsOption] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var exclude: js.UndefOr[PluginList] = js.native
  
  var forceAllTransforms: js.UndefOr[Boolean] = js.native
  
  var ignoreBrowserslistConfig: js.UndefOr[Boolean] = js.native
  
  var include: js.UndefOr[PluginList] = js.native
  
  var loose: js.UndefOr[Boolean] = js.native
  
  var modules: js.UndefOr[ModuleOption] = js.native
  
  var shippedProposals: js.UndefOr[Boolean] = js.native
  
  var spec: js.UndefOr[Boolean] = js.native
  
  var targets: js.UndefOr[TargetsOptions] = js.native
  
  var useBuiltIns: js.UndefOr[UseBuiltInsOption] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBugfixes(value: Boolean): Self = this.set("bugfixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBugfixes: Self = this.set("bugfixes", js.undefined)
    
    @scala.inline
    def setConfigPath(value: String): Self = this.set("configPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigPath: Self = this.set("configPath", js.undefined)
    
    @scala.inline
    def setCorejs(value: CorejsOption): Self = this.set("corejs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorejs: Self = this.set("corejs", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: PluginListItem*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: PluginList): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setForceAllTransforms(value: Boolean): Self = this.set("forceAllTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceAllTransforms: Self = this.set("forceAllTransforms", js.undefined)
    
    @scala.inline
    def setIgnoreBrowserslistConfig(value: Boolean): Self = this.set("ignoreBrowserslistConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreBrowserslistConfig: Self = this.set("ignoreBrowserslistConfig", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: PluginListItem*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: PluginList): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setLoose(value: Boolean): Self = this.set("loose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoose: Self = this.set("loose", js.undefined)
    
    @scala.inline
    def setModules(value: ModuleOption): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setShippedProposals(value: Boolean): Self = this.set("shippedProposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippedProposals: Self = this.set("shippedProposals", js.undefined)
    
    @scala.inline
    def setSpec(value: Boolean): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: BrowserslistQuery*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: TargetsOptions): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    
    @scala.inline
    def setUseBuiltIns(value: UseBuiltInsOption): Self = this.set("useBuiltIns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBuiltIns: Self = this.set("useBuiltIns", js.undefined)
  }
}
