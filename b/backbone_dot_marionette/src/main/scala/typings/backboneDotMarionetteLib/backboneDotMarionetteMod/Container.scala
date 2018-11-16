package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.marionette", "Container")
@js.native
class Container[TView] () extends js.Object {
  /**
       * Find a view by it's cid.
       */
  def add(view: TView): scala.Unit = js.native
  /**
       * Find a view by it's cid.
       */
  def add(view: TView, customIndex: scala.Double): scala.Unit = js.native
  /**
       * Find a view by it's cid.
       */
  def findByCid(cid: java.lang.String): TView = js.native
  /**
       * Find by custom key.
       */
  def findByCustom(key: java.lang.String): TView = js.native
  /**
       * Find by numeric index (unstable).
       */
  def findByIndex(index: scala.Double): TView = js.native
  /**
       * Find a view by model.
       */
  def findByModel(model: backboneLib.backboneMod.Model): TView = js.native
  /**
       * Find a view by model cid.
       */
  def findByModelCid(modelCid: java.lang.String): TView = js.native
  /**
       * Find a view by it's cid.
       */
  def remove(view: TView): scala.Unit = js.native
}

