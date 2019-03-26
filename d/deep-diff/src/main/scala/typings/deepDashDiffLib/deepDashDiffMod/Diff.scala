package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - DiffNew[RHS]
  - DiffDeleted[LHS]
  - DiffEdit[LHS, RHS]
  - DiffArray[LHS, RHS]
*/
trait Diff[LHS, RHS] extends js.Object

