package typings.cidrRegex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    Regular expression for matching IP addresses in CIDR notation.
    @returns A regex for matching both IPv4 and IPv6 CIDR IP addresses.
    @example
    ```
    import cidrRegex = require("cidr-regex");
    // Contains a CIDR IP address?
    cidrRegex().test("foo 192.168.0.1/24");
    //=> true
    // Is a CIDR IP address?
    cidrRegex({exact: true}).test("foo 192.168.0.1/24");
    //=> false
    "foo 192.168.0.1/24 bar 1:2:3:4:5:6:7:8/64 baz".match(cidrRegex());
    //=> ["192.168.0.1/24", "1:2:3:4:5:6:7:8/64"]
    ```
    */
  inline def apply(): js.RegExp = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.RegExp]
  inline def apply(options: Options): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  @JSImport("cidr-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    @returns A regex for matching IPv4 CIDR IP addresses.
    */
  inline def v4(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")().asInstanceOf[js.RegExp]
  inline def v4(options: Options): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  /**
    @returns A regex for matching IPv6 CIDR IP addresses.
    @example
    ```
    import cidrRegex = require("cidr-regex");
    cidrRegex.v6({exact: true}).test("1:2:3:4:5:6:7:8/64");
    //=> true
    ```
    */
  inline def v6(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("v6")().asInstanceOf[js.RegExp]
  inline def v6(options: Options): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("v6")(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  trait Options extends StObject {
    
    /**
      Only match an exact string. Useful with `RegExp#test()` to check if a string is a CIDR IP address. *(`false` matches any CIDR IP address in a string)*
      @default false
      */
    val exact: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    }
  }
}
