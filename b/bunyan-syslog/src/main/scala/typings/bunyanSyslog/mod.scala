package typings.bunyanSyslog

import typings.bunyanSyslog.bunyanSyslogInts.`0`
import typings.bunyanSyslog.bunyanSyslogInts.`24`
import typings.std.Exclude
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan-syslog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bunyan-syslog", "auth")
  @js.native
  val auth: /* 4 */ Double = js.native
  
  @JSImport("bunyan-syslog", "authpriv")
  @js.native
  val authpriv: /* 10 */ Double = js.native
  
  inline def createBunyanStream(options: StreamOptions): WritableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBunyanStream")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream[Any]]
  
  @JSImport("bunyan-syslog", "cron")
  @js.native
  val cron: /* 15 */ Double = js.native
  
  @JSImport("bunyan-syslog", "daemon")
  @js.native
  val daemon: /* 3 */ Double = js.native
  
  @JSImport("bunyan-syslog", "ftp")
  @js.native
  val ftp: /* 11 */ Double = js.native
  
  @JSImport("bunyan-syslog", "kern")
  @js.native
  val kern: /* 0 */ Double = js.native
  
  @JSImport("bunyan-syslog", "local0")
  @js.native
  val local0: /* 16 */ Double = js.native
  
  @JSImport("bunyan-syslog", "local1")
  @js.native
  val local1: /* 17 */ Double = js.native
  
  @JSImport("bunyan-syslog", "local2")
  @js.native
  val local2: /* 18 */ Double = js.native
  
  @JSImport("bunyan-syslog", "local3")
  @js.native
  val local3: /* 19 */ Double = js.native
  
  @JSImport("bunyan-syslog", "local4")
  @js.native
  val local4: /* 20 */ Double = js.native
  
  @JSImport("bunyan-syslog", "local5")
  @js.native
  val local5: /* 21 */ Double = js.native
  
  @JSImport("bunyan-syslog", "local6")
  @js.native
  val local6: /* 22 */ Double = js.native
  
  @JSImport("bunyan-syslog", "local7")
  @js.native
  val local7: /* 23 */ Double = js.native
  
  @JSImport("bunyan-syslog", "lpr")
  @js.native
  val lpr: /* 6 */ Double = js.native
  
  @JSImport("bunyan-syslog", "mail")
  @js.native
  val mail: /* 2 */ Double = js.native
  
  @JSImport("bunyan-syslog", "news")
  @js.native
  val news: /* 7 */ Double = js.native
  
  @JSImport("bunyan-syslog", "syslog")
  @js.native
  val syslog: /* 5 */ Double = js.native
  
  @JSImport("bunyan-syslog", "user")
  @js.native
  val user: /* 1 */ Double = js.native
  
  @JSImport("bunyan-syslog", "uucp")
  @js.native
  val uucp: /* 8 */ Double = js.native
  
  type Enumerate[N /* <: Double */] = Any
  
  type EnumerateInternal[A /* <: js.Array[Any] */, N /* <: Double */] = /* import warning: importer.ImportType#apply Failed type conversion: bunyan-syslog.anon.0<A, N>[N extends A['length'] ? 0 : 1] */ js.Any
  
  type Facility = Range[`0`, `24`]
  
  type PrependNextNum[A /* <: js.Array[Any] */] = Any
  
  type Range[FROM /* <: Double */, TO /* <: Double */] = Exclude[Enumerate[TO], Enumerate[FROM]]
  
  trait StreamOptions extends StObject {
    
    var facility: Facility
    
    var host: String
    
    var port: Double
    
    var `type`: StreamType
  }
  object StreamOptions {
    
    inline def apply(facility: Facility, host: String, port: Double, `type`: StreamType): StreamOptions = {
      val __obj = js.Dynamic.literal(facility = facility.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamOptions]
    }
    
    extension [Self <: StreamOptions](x: Self) {
      
      inline def setFacility(value: Facility): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setType(value: StreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bunyanSyslog.bunyanSyslogStrings.sys
    - typings.bunyanSyslog.bunyanSyslogStrings.tcp
    - typings.bunyanSyslog.bunyanSyslogStrings.udp
  */
  trait StreamType extends StObject
  object StreamType {
    
    inline def sys: typings.bunyanSyslog.bunyanSyslogStrings.sys = "sys".asInstanceOf[typings.bunyanSyslog.bunyanSyslogStrings.sys]
    
    inline def tcp: typings.bunyanSyslog.bunyanSyslogStrings.tcp = "tcp".asInstanceOf[typings.bunyanSyslog.bunyanSyslogStrings.tcp]
    
    inline def udp: typings.bunyanSyslog.bunyanSyslogStrings.udp = "udp".asInstanceOf[typings.bunyanSyslog.bunyanSyslogStrings.udp]
  }
}
