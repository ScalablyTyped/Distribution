package typings.dependencyTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var detective: js.UndefOr[js.Any] = js.native
  var directory: js.UndefOr[String] = js.native
  var filename: String = js.native
  var filter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.native
  var isListForm: js.UndefOr[Boolean] = js.native
  var nodeModulesConfig: js.UndefOr[js.Any] = js.native
  var nonExistent: js.UndefOr[js.Array[String]] = js.native
  var requireConfig: js.UndefOr[String] = js.native
  var tsConfig: js.UndefOr[String] = js.native
  var visited: js.UndefOr[DependencyObj] = js.native
  var webpackConfig: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(filename: String): Options = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetective(value: js.Any): Self = this.set("detective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetective: Self = this.set("detective", js.undefined)
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    @scala.inline
    def setFilter(value: /* path */ String => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setIsListForm(value: Boolean): Self = this.set("isListForm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsListForm: Self = this.set("isListForm", js.undefined)
    @scala.inline
    def setNodeModulesConfig(value: js.Any): Self = this.set("nodeModulesConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeModulesConfig: Self = this.set("nodeModulesConfig", js.undefined)
    @scala.inline
    def setNonExistentVarargs(value: String*): Self = this.set("nonExistent", js.Array(value :_*))
    @scala.inline
    def setNonExistent(value: js.Array[String]): Self = this.set("nonExistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonExistent: Self = this.set("nonExistent", js.undefined)
    @scala.inline
    def setRequireConfig(value: String): Self = this.set("requireConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireConfig: Self = this.set("requireConfig", js.undefined)
    @scala.inline
    def setTsConfig(value: String): Self = this.set("tsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsConfig: Self = this.set("tsConfig", js.undefined)
    @scala.inline
    def setVisited(value: DependencyObj): Self = this.set("visited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisited: Self = this.set("visited", js.undefined)
    @scala.inline
    def setWebpackConfig(value: String): Self = this.set("webpackConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebpackConfig: Self = this.set("webpackConfig", js.undefined)
  }
  
}

