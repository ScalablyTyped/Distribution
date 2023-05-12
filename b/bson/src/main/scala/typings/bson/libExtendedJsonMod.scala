package typings.bson

import typings.bson.libBsonMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExtendedJsonMod {
  
  /** @public */
  object EJSON {
    
    @JSImport("bson/lib/extended_json", "EJSON")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bson/lib/extended_json", "EJSON.deserialize")
    @js.native
    def deserialize: js.Function2[/* ejson */ Document, /* options */ js.UndefOr[EJSONOptions], Any] = js.native
    inline def deserialize(ejson: Document): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(ejson.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def deserialize(ejson: Document, options: EJSONOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(ejson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def deserialize_=(x: js.Function2[/* ejson */ Document, /* options */ js.UndefOr[EJSONOptions], Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("bson/lib/extended_json", "EJSON.parse")
    @js.native
    def parse: js.Function2[/* text */ String, /* options */ js.UndefOr[EJSONOptions], Any] = js.native
    inline def parse(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def parse(text: String, options: EJSONOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def parse_=(x: js.Function2[/* text */ String, /* options */ js.UndefOr[EJSONOptions], Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("bson/lib/extended_json", "EJSON.serialize")
    @js.native
    def serialize: js.Function2[/* value */ Any, /* options */ js.UndefOr[EJSONOptions], Document] = js.native
    inline def serialize(value: Any): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[Document]
    inline def serialize(value: Any, options: EJSONOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def serialize_=(x: js.Function2[/* value */ Any, /* options */ js.UndefOr[EJSONOptions], Document]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("bson/lib/extended_json", "EJSON.stringify")
    @js.native
    def stringify: js.Function4[
        /* value */ Any, 
        /* replacer */ js.UndefOr[
          (js.Array[Double | String]) | (js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) | EJSONOptions
        ], 
        /* space */ js.UndefOr[String | Double], 
        /* options */ js.UndefOr[EJSONOptions], 
        String
      ] = js.native
    inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[Double | String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[Double | String], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[Double | String], space: String, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[Double | String], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[Double | String], space: Double, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[Double | String], space: Unit, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: String,
      options: EJSONOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: Double
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: Double,
      options: EJSONOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: Unit,
      options: EJSONOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: Unit, space: String, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: Unit, space: Double, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: Unit, space: Unit, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions, space: String, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions, space: Double, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions, space: Unit, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify_=(
      x: js.Function4[
          /* value */ Any, 
          /* replacer */ js.UndefOr[
            (js.Array[Double | String]) | (js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) | EJSONOptions
          ], 
          /* space */ js.UndefOr[String | Double], 
          /* options */ js.UndefOr[EJSONOptions], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringify")(x.asInstanceOf[js.Any])
  }
  
  trait EJSONOptions extends StObject {
    
    /**
      * Output using the Extended JSON v1 spec
      * @defaultValue `false`
      */
    var legacy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable Extended JSON's `relaxed` mode, which attempts to return native JS types where possible, rather than BSON types
      * @defaultValue `false` */
    var relaxed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable native bigint support
      * @defaultValue `false`
      */
    var useBigInt64: js.UndefOr[Boolean] = js.undefined
  }
  object EJSONOptions {
    
    inline def apply(): EJSONOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EJSONOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EJSONOptions] (val x: Self) extends AnyVal {
      
      inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
      
      inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
      
      inline def setRelaxed(value: Boolean): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
      
      inline def setRelaxedUndefined: Self = StObject.set(x, "relaxed", js.undefined)
      
      inline def setUseBigInt64(value: Boolean): Self = StObject.set(x, "useBigInt64", value.asInstanceOf[js.Any])
      
      inline def setUseBigInt64Undefined: Self = StObject.set(x, "useBigInt64", js.undefined)
    }
  }
}
