package typings.del.mod

import typings.globby.mod.GlobbyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends GlobbyOptions {
  /**
  		See what would be deleted.
  		@default false
  		@example
  		```
  		import del = require('del');
  		(async () => {
  			const deletedPaths = await del(['temp/ *.js'], {dryRun: true});
  			console.log('Files and directories that would be deleted:\n', deletedPaths.join('\n'));
  		})();
  		```
  		*/
  val dryRun: js.UndefOr[Boolean] = js.native
  /**
  		Allow deleting the current working directory and outside.
  		@default false
  		*/
  val force: js.UndefOr[Boolean] = js.native
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
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
  }
  
}

