package typings.bunyanSyslog

import typings.bunyanSyslog.mod.StreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bunyanSyslogStrings {
  
  @js.native
  sealed trait sys
    extends StObject
       with StreamType
  inline def sys: sys = "sys".asInstanceOf[sys]
  
  @js.native
  sealed trait tcp
    extends StObject
       with StreamType
  inline def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @js.native
  sealed trait udp
    extends StObject
       with StreamType
  inline def udp: udp = "udp".asInstanceOf[udp]
}
