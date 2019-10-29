package typings.broccoliDashNodeDashApi.broccoliDashNodeDashApiMod

import typings.broccoliDashNodeDashApi.broccoliDashNodeDashApiStrings.source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceNodeInfo
  extends NodeInfoCommon[source]
     with NodeInfo {
  /**
    A path to an existing directory on disk, relative to the current working directory.
    */
  var sourceDirectory: String
  /**
    If false, changed files in the sourceDirectory will not trigger rebuilds
    (though they might still be picked up by subsequent rebuilds). If true,
    instructs the Broccoli file system watcher to watch the sourceDirectory
    recursively and trigger a rebuild whenever a file changes.
    */
  var watched: Boolean
}

object SourceNodeInfo {
  @scala.inline
  def apply(
    instantiationStack: String,
    name: String,
    nodeType: source,
    sourceDirectory: String,
    watched: Boolean,
    annotation: String = null
  ): SourceNodeInfo = {
    val __obj = js.Dynamic.literal(instantiationStack = instantiationStack, name = name, nodeType = nodeType, sourceDirectory = sourceDirectory, watched = watched)
    if (annotation != null) __obj.updateDynamic("annotation")(annotation)
    __obj.asInstanceOf[SourceNodeInfo]
  }
}

