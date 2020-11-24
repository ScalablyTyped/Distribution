package typings.circularJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("circular-json", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def parse(text: String): js.Any = js.native
  def parse(text: String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, _]): js.Any = js.native
  
  def stringify(value: js.Any): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.UndefOr[scala.Nothing],
    space: js.UndefOr[scala.Nothing],
    placeholder: Boolean
  ): String = js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: js.Any): String = js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: js.Any, placeholder: Boolean): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Array[Double | String],
    space: js.UndefOr[scala.Nothing],
    placeholder: Boolean
  ): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: js.Any): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: js.Any, placeholder: Boolean): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
    space: js.UndefOr[scala.Nothing],
    placeholder: Boolean
  ): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: js.Any): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
    space: js.Any,
    placeholder: Boolean
  ): String = js.native
  def stringify(value: js.Any, replacer: Null, space: js.UndefOr[scala.Nothing], placeholder: Boolean): String = js.native
  def stringify(value: js.Any, replacer: Null, space: js.Any): String = js.native
  def stringify(value: js.Any, replacer: Null, space: js.Any, placeholder: Boolean): String = js.native
}
