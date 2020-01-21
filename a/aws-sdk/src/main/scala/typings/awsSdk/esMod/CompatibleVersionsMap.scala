package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompatibleVersionsMap extends js.Object {
  /**
    * The current version of Elasticsearch on which a domain is.
    */
  var SourceVersion: js.UndefOr[ElasticsearchVersionString] = js.native
  var TargetVersions: js.UndefOr[ElasticsearchVersionList] = js.native
}

object CompatibleVersionsMap {
  @scala.inline
  def apply(SourceVersion: ElasticsearchVersionString = null, TargetVersions: ElasticsearchVersionList = null): CompatibleVersionsMap = {
    val __obj = js.Dynamic.literal()
    if (SourceVersion != null) __obj.updateDynamic("SourceVersion")(SourceVersion.asInstanceOf[js.Any])
    if (TargetVersions != null) __obj.updateDynamic("TargetVersions")(TargetVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompatibleVersionsMap]
  }
}

