package typings
package delLib.delMod.delNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof glob.glob.G.IOptions ]: glob.glob.G.IOptions[P]} */ trait Options extends js.Object {
  /**
  		Concurrency limit. Minimum: `1`.
  		@default Infinity
  		*/
  val concurrency: js.UndefOr[scala.Double] = js.undefined
  /**
  		See what would be deleted.
  		@default false
  		@example
  		```
  		import del = require('del');
  		(async () => {
  			const deletedPaths = await del(['tmp/ *.js'], {dryRun: true});
  			console.log('Files and folders that would be deleted:\n', deletedPaths.join('\n'));
  		})();
  		```
  		*/
  val dryRun: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Allow deleting the current working directory and outside.
  		@default false
  		*/
  val force: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    concurrency: scala.Int | scala.Double = null,
    dryRun: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[Options]
  }
}

