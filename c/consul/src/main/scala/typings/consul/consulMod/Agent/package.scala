package typings.consul.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Agent {
  import typings.consul.consulMod.Agent.Check.ListOptions
  import typings.consul.consulMod.CommonOptions

  type Check = Check_
  type ChecksOptions = ListOptions
  type SelfOptions = CommonOptions
  type Service = Service_
  type ServicesOptions = typings.consul.consulMod.Agent.Service.ListOptions
}
