package typings.bitcoinComputerLib

import org.scalablytyped.runtime.StringDictionary
import typings.bitcoinComputerLib.bitcoinComputerLibStrings.ASC
import typings.bitcoinComputerLib.bitcoinComputerLibStrings.DESC
import typings.bitcoinComputerLib.mod.Class
import typings.bitcoinComputerLib.mod.Location
import typings.std.ConstructorParameters
import typings.std.InstanceType
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args[T /* <: Class */] extends StObject {
    
    var args: js.UndefOr[ConstructorParameters[T]] = js.undefined
    
    var `class`: T
  }
  object Args {
    
    inline def apply[T /* <: Class */](`class`: T): Args[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args[?], T /* <: Class */] (val x: Self & Args[T]) extends AnyVal {
      
      inline def setArgs(value: ConstructorParameters[T]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setClass(value: T): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    }
  }
  
  trait Constructor[T /* <: Class */] extends StObject {
    
    var args: js.UndefOr[ConstructorParameters[T]] = js.undefined
    
    var constructor: T
    
    var mod: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
  }
  object Constructor {
    
    inline def apply[T /* <: Class */](constructor: T): Constructor[T] = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constructor[?], T /* <: Class */] (val x: Self & Constructor[T]) extends AnyVal {
      
      inline def setArgs(value: ConstructorParameters[T]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setConstructor(value: T): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait DataPrefix extends StObject {
    
    var dataPrefix: String
    
    var ioDescriptor: js.Array[Double]
  }
  object DataPrefix {
    
    inline def apply(dataPrefix: String, ioDescriptor: js.Array[Double]): DataPrefix = {
      val __obj = js.Dynamic.literal(dataPrefix = dataPrefix.asInstanceOf[js.Any], ioDescriptor = ioDescriptor.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataPrefix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataPrefix] (val x: Self) extends AnyVal {
      
      inline def setDataPrefix(value: String): Self = StObject.set(x, "dataPrefix", value.asInstanceOf[js.Any])
      
      inline def setIoDescriptor(value: js.Array[Double]): Self = StObject.set(x, "ioDescriptor", value.asInstanceOf[js.Any])
      
      inline def setIoDescriptorVarargs(value: Double*): Self = StObject.set(x, "ioDescriptor", js.Array(value*))
    }
  }
  
  trait Hex extends StObject {
    
    var hex: js.UndefOr[String] = js.undefined
  }
  object Hex {
    
    inline def apply(): Hex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hex] (val x: Self) extends AnyVal {
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
    }
  }
  
  trait Json extends StObject {
    
    var json: js.UndefOr[String] = js.undefined
  }
  object Json {
    
    inline def apply(): Json = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Json]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Json] (val x: Self) extends AnyVal {
      
      inline def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  trait Mod[T /* <: Class */, K /* <: /* keyof std.InstanceType<T> */ String */] extends StObject {
    
    var args: Parameters[
        /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<T>[K] */ js.Any
      ]
    
    var mod: js.UndefOr[String] = js.undefined
    
    var property: String
    
    var target: InstanceType[T] & Location
  }
  object Mod {
    
    inline def apply[T /* <: Class */, K /* <: /* keyof std.InstanceType<T> */ String */](
      args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<T>[K] */ js.Any
        ],
      property: String,
      target: InstanceType[T] & Location
    ): Mod[T, K] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mod[T, K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mod[?, ?], T /* <: Class */, K /* <: /* keyof std.InstanceType<T> */ String */] (val x: Self & (Mod[T, K])) extends AnyVal {
      
      inline def setArgs(
        value: Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<T>[K] */ js.Any
            ]
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: InstanceType[T] & Location): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@bitcoin-computer/lib.@bitcoin-computer/lib.ProgramMetaData> */
  trait PartialProgramMetaData extends StObject {
    
    var _amount: js.UndefOr[Double] = js.undefined
    
    var _owners: js.UndefOr[js.Array[String]] = js.undefined
    
    var _readers: js.UndefOr[js.Array[String]] = js.undefined
    
    var _url: js.UndefOr[String] = js.undefined
  }
  object PartialProgramMetaData {
    
    inline def apply(): PartialProgramMetaData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialProgramMetaData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialProgramMetaData] (val x: Self) extends AnyVal {
      
      inline def set_amount(value: Double): Self = StObject.set(x, "_amount", value.asInstanceOf[js.Any])
      
      inline def set_amountUndefined: Self = StObject.set(x, "_amount", js.undefined)
      
      inline def set_owners(value: js.Array[String]): Self = StObject.set(x, "_owners", value.asInstanceOf[js.Any])
      
      inline def set_ownersUndefined: Self = StObject.set(x, "_owners", js.undefined)
      
      inline def set_ownersVarargs(value: String*): Self = StObject.set(x, "_owners", js.Array(value*))
      
      inline def set_readers(value: js.Array[String]): Self = StObject.set(x, "_readers", value.asInstanceOf[js.Any])
      
      inline def set_readersUndefined: Self = StObject.set(x, "_readers", js.undefined)
      
      inline def set_readersVarargs(value: String*): Self = StObject.set(x, "_readers", js.Array(value*))
      
      inline def set_url(value: String): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
      
      inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@bitcoin-computer/lib.@bitcoin-computer/lib.Query> */
  trait PartialQuery extends StObject {
    
    var classHash: js.UndefOr[String] = js.undefined
    
    var ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var mod: js.UndefOr[String] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[ASC | DESC] = js.undefined
    
    var publicKey: js.UndefOr[String] = js.undefined
  }
  object PartialQuery {
    
    inline def apply(): PartialQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialQuery] (val x: Self) extends AnyVal {
      
      inline def setClassHash(value: String): Self = StObject.set(x, "classHash", value.asInstanceOf[js.Any])
      
      inline def setClassHashUndefined: Self = StObject.set(x, "classHash", js.undefined)
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrder(value: ASC | DESC): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@bitcoin-computer/lib.@bitcoin-computer/lib.SelectUtxos> */
  trait PartialSelectUtxos extends StObject {
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var include: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PartialSelectUtxos {
    
    inline def apply(): PartialSelectUtxos = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSelectUtxos]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSelectUtxos] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@bitcoin-computer/lib.@bitcoin-computer/lib.TransitionJSON> */
  trait PartialTransitionJSON extends StObject {
    
    var env: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var exp: js.UndefOr[String] = js.undefined
    
    var mod: js.UndefOr[String] = js.undefined
  }
  object PartialTransitionJSON {
    
    inline def apply(): PartialTransitionJSON = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTransitionJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialTransitionJSON] (val x: Self) extends AnyVal {
      
      inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
      
      inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
    }
  }
}
