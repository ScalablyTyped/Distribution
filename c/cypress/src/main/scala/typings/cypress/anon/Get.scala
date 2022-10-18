package typings.cypress.anon

import typings.cypress.typesSinonMod.SinonSpy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get[T, K /* <: /* keyof T */ String */] extends StObject {
  
  // Methods
  def get(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  @JSName("get")
  var get_Original: SinonSpy[
    js.Array[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]
  
  // Methods
  def set(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): Unit
  @JSName("set")
  var set_Original: SinonSpy[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ], 
    Unit
  ]
}
object Get {
  
  inline def apply[T, K /* <: /* keyof T */ String */](
    get: SinonSpy[
      js.Array[Any], 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    set: SinonSpy[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ]
  ): Get[T, K] = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get[T, K]]
  }
  
  extension [Self <: Get[?, ?], T, K /* <: /* keyof T */ String */](x: Self & (Get[T, K])) {
    
    inline def setGet(
      value: SinonSpy[
          js.Array[Any], 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setSet(
      value: SinonSpy[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
          ], 
          Unit
        ]
    ): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
