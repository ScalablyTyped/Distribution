package typings.circularJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("circular-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(text: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def parse(text: String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def stringify(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Array[Double | String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Array[Double | String], space: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Array[Double | String], space: js.Any, placeholder: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Array[Double | String], space: Unit, placeholder: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any], space: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any],
    space: js.Any,
    placeholder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any],
    space: Unit,
    placeholder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Null, space: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Null, space: js.Any, placeholder: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Null, space: Unit, placeholder: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: js.Any, placeholder: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: Unit, placeholder: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any])).asInstanceOf[String]
}
