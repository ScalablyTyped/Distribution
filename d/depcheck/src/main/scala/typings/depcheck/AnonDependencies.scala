package typings.depcheck

import typings.depcheck.mod.PackageDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDependencies extends js.Object {
  var dependencies: js.UndefOr[PackageDependencies] = js.undefined
  var devDependencies: js.UndefOr[PackageDependencies] = js.undefined
  var optionalDependencies: js.UndefOr[PackageDependencies] = js.undefined
  var peerDependencies: js.UndefOr[PackageDependencies] = js.undefined
}

object AnonDependencies {
  @scala.inline
  def apply(
    dependencies: PackageDependencies = null,
    devDependencies: PackageDependencies = null,
    optionalDependencies: PackageDependencies = null,
    peerDependencies: PackageDependencies = null
  ): AnonDependencies = {
    val __obj = js.Dynamic.literal()
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies.asInstanceOf[js.Any])
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDependencies]
  }
}

