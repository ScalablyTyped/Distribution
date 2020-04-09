package typings.babelPresetEnv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bugfixes: js.UndefOr[Boolean] = js.undefined
  var configPath: js.UndefOr[String] = js.undefined
  var corejs: js.UndefOr[CorejsOption] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[PluginList] = js.undefined
  var forceAllTransforms: js.UndefOr[Boolean] = js.undefined
  var ignoreBrowserslistConfig: js.UndefOr[Boolean] = js.undefined
  var include: js.UndefOr[PluginList] = js.undefined
  var loose: js.UndefOr[Boolean] = js.undefined
  var modules: js.UndefOr[ModuleOption] = js.undefined
  var shippedProposals: js.UndefOr[Boolean] = js.undefined
  var spec: js.UndefOr[Boolean] = js.undefined
  var targets: js.UndefOr[TargetsOptions] = js.undefined
  var useBuiltIns: js.UndefOr[UseBuiltInsOption] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bugfixes: js.UndefOr[Boolean] = js.undefined,
    configPath: String = null,
    corejs: CorejsOption = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    exclude: PluginList = null,
    forceAllTransforms: js.UndefOr[Boolean] = js.undefined,
    ignoreBrowserslistConfig: js.UndefOr[Boolean] = js.undefined,
    include: PluginList = null,
    loose: js.UndefOr[Boolean] = js.undefined,
    modules: ModuleOption = null,
    shippedProposals: js.UndefOr[Boolean] = js.undefined,
    spec: js.UndefOr[Boolean] = js.undefined,
    targets: TargetsOptions = null,
    useBuiltIns: UseBuiltInsOption = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bugfixes)) __obj.updateDynamic("bugfixes")(bugfixes.asInstanceOf[js.Any])
    if (configPath != null) __obj.updateDynamic("configPath")(configPath.asInstanceOf[js.Any])
    if (corejs != null) __obj.updateDynamic("corejs")(corejs.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(forceAllTransforms)) __obj.updateDynamic("forceAllTransforms")(forceAllTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBrowserslistConfig)) __obj.updateDynamic("ignoreBrowserslistConfig")(ignoreBrowserslistConfig.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (!js.isUndefined(shippedProposals)) __obj.updateDynamic("shippedProposals")(shippedProposals.asInstanceOf[js.Any])
    if (!js.isUndefined(spec)) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (useBuiltIns != null) __obj.updateDynamic("useBuiltIns")(useBuiltIns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

