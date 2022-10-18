package typings.cassandraDriver.mod

import typings.cassandraDriver.libMappingMod.mapping.MappingOptions
import typings.cassandraDriver.libMappingMod.mapping.q.QueryOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapping {
  
  @JSImport("cassandra-driver", "mapping.DefaultTableMappings")
  @js.native
  open class DefaultTableMappings ()
    extends typings.cassandraDriver.libMappingMod.mapping.DefaultTableMappings
  
  @JSImport("cassandra-driver", "mapping.Mapper")
  @js.native
  open class Mapper protected ()
    extends typings.cassandraDriver.libMappingMod.mapping.Mapper {
    def this(client: Client) = this()
    def this(client: Client, options: MappingOptions) = this()
  }
  
  @JSImport("cassandra-driver", "mapping.UnderscoreCqlToCamelCaseMappings")
  @js.native
  open class UnderscoreCqlToCamelCaseMappings ()
    extends typings.cassandraDriver.libMappingMod.mapping.UnderscoreCqlToCamelCaseMappings
  
  object q {
    
    @JSImport("cassandra-driver", "mapping.q")
    @js.native
    val ^ : js.Any = js.native
    
    inline def and(condition1: Any, condition2: Any): QueryOperator = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(condition1.asInstanceOf[js.Any], condition2.asInstanceOf[js.Any])).asInstanceOf[QueryOperator]
    
    inline def append(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("append")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    inline def decr(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("decr")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    inline def gt(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("gt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    inline def gte(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("gte")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    inline def in(arr: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("in_")(arr.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    inline def incr(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("incr")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    inline def lt(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("lt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    inline def lte(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("lte")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    inline def notEq(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("notEq")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    inline def prepend(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    inline def remove(value: Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
  }
}
