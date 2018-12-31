package typings
package cqrsDashDomainLib.cqrsDashDomainMod.DomainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region definePreCondition
trait DefinePreConditionOptions extends js.Object {
  /**
    * optional
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * the command name
    * optional, default is file name without extension,
    * if name is '' it will handle all commands that matches the appropriate aggregate
    * if name is an array of strings it will handle all commands that matches the appropriate name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, if not defined it will use what is defined as default in aggregate or pass the whole command
    */
  var payload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default Infinity, all pre-conditions will be sorted by this value
    */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /**
    * optional, default 0
    */
  var version: js.UndefOr[scala.Double] = js.undefined
}

