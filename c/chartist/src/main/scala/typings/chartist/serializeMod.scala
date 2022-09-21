package typings.chartist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializeMod {
  
  @JSImport("chartist/dist/core/data/serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserialize[T /* <: js.Object | Double | String */](): js.UndefOr[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")().asInstanceOf[js.UndefOr[T | Null]]
  inline def deserialize[T /* <: js.Object | Double | String */](data: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def deserialize_T_UnionObjectDoubleString_Union[T /* <: js.Object | Double | String */](data: String): js.UndefOr[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T | Null]]
  
  inline def serialize(): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(data: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(data: Any): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize(data: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serialize_Union(data: String): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize_Union(data: js.Object): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize_Union(data: Double): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
}
