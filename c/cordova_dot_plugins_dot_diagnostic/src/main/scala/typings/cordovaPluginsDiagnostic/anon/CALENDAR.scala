package typings.cordovaPluginsDiagnostic.anon

import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ACCESS_COARSE_LOCATION
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ACCESS_FINE_LOCATION
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ADD_VOICEMAIL
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.BODY_SENSORS
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.CALL_PHONE
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.CAMERA
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.GET_ACCOUNTS
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.PROCESS_OUTGOING_CALLS
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_CALENDAR
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_CALL_LOG
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_CONTACTS
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_EXTERNAL_STORAGE
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_PHONE_STATE
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_SMS
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.RECEIVE_MMS
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.RECEIVE_SMS
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.RECEIVE_WAP_PUSH
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.RECORD_AUDIO
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.SEND_SMS
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.USE_SIP
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.WRITE_CALENDAR
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.WRITE_CALL_LOG
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.WRITE_CONTACTS
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.WRITE_EXTERNAL_STORAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CALENDAR extends js.Object {
  var CALENDAR: js.Tuple2[READ_CALENDAR, WRITE_CALENDAR] = js.native
  var CAMERA: js.Array[typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.CAMERA] = js.native
  var CONTACTS: js.Tuple3[READ_CONTACTS, WRITE_CONTACTS, GET_ACCOUNTS] = js.native
  var LOCATION: js.Tuple2[ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION] = js.native
  var MICROPHONE: js.Array[RECORD_AUDIO] = js.native
  var PHONE: js.Tuple7[
    READ_PHONE_STATE, 
    CALL_PHONE, 
    ADD_VOICEMAIL, 
    USE_SIP, 
    PROCESS_OUTGOING_CALLS, 
    READ_CALL_LOG, 
    WRITE_CALL_LOG
  ] = js.native
  var SENSORS: js.Array[BODY_SENSORS] = js.native
  var SMS: js.Tuple5[SEND_SMS, RECEIVE_SMS, READ_SMS, RECEIVE_WAP_PUSH, RECEIVE_MMS] = js.native
  var STORAGE: js.Tuple2[READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE] = js.native
}

object CALENDAR {
  @scala.inline
  def apply(
    CALENDAR: js.Tuple2[READ_CALENDAR, WRITE_CALENDAR],
    CAMERA: js.Array[CAMERA],
    CONTACTS: js.Tuple3[READ_CONTACTS, WRITE_CONTACTS, GET_ACCOUNTS],
    LOCATION: js.Tuple2[ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION],
    MICROPHONE: js.Array[RECORD_AUDIO],
    PHONE: js.Tuple7[
      READ_PHONE_STATE, 
      CALL_PHONE, 
      ADD_VOICEMAIL, 
      USE_SIP, 
      PROCESS_OUTGOING_CALLS, 
      READ_CALL_LOG, 
      WRITE_CALL_LOG
    ],
    SENSORS: js.Array[BODY_SENSORS],
    SMS: js.Tuple5[SEND_SMS, RECEIVE_SMS, READ_SMS, RECEIVE_WAP_PUSH, RECEIVE_MMS],
    STORAGE: js.Tuple2[READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE]
  ): CALENDAR = {
    val __obj = js.Dynamic.literal(CALENDAR = CALENDAR.asInstanceOf[js.Any], CAMERA = CAMERA.asInstanceOf[js.Any], CONTACTS = CONTACTS.asInstanceOf[js.Any], LOCATION = LOCATION.asInstanceOf[js.Any], MICROPHONE = MICROPHONE.asInstanceOf[js.Any], PHONE = PHONE.asInstanceOf[js.Any], SENSORS = SENSORS.asInstanceOf[js.Any], SMS = SMS.asInstanceOf[js.Any], STORAGE = STORAGE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CALENDAR]
  }
  @scala.inline
  implicit class CALENDAROps[Self <: CALENDAR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCALENDAR(value: js.Tuple2[READ_CALENDAR, WRITE_CALENDAR]): Self = this.set("CALENDAR", value.asInstanceOf[js.Any])
    @scala.inline
    def setCAMERAVarargs(value: CAMERA*): Self = this.set("CAMERA", js.Array(value :_*))
    @scala.inline
    def setCAMERA(value: js.Array[CAMERA]): Self = this.set("CAMERA", value.asInstanceOf[js.Any])
    @scala.inline
    def setCONTACTS(value: js.Tuple3[READ_CONTACTS, WRITE_CONTACTS, GET_ACCOUNTS]): Self = this.set("CONTACTS", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOCATION(value: js.Tuple2[ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION]): Self = this.set("LOCATION", value.asInstanceOf[js.Any])
    @scala.inline
    def setMICROPHONEVarargs(value: RECORD_AUDIO*): Self = this.set("MICROPHONE", js.Array(value :_*))
    @scala.inline
    def setMICROPHONE(value: js.Array[RECORD_AUDIO]): Self = this.set("MICROPHONE", value.asInstanceOf[js.Any])
    @scala.inline
    def setPHONE(
      value: js.Tuple7[
          READ_PHONE_STATE, 
          CALL_PHONE, 
          ADD_VOICEMAIL, 
          USE_SIP, 
          PROCESS_OUTGOING_CALLS, 
          READ_CALL_LOG, 
          WRITE_CALL_LOG
        ]
    ): Self = this.set("PHONE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSENSORSVarargs(value: BODY_SENSORS*): Self = this.set("SENSORS", js.Array(value :_*))
    @scala.inline
    def setSENSORS(value: js.Array[BODY_SENSORS]): Self = this.set("SENSORS", value.asInstanceOf[js.Any])
    @scala.inline
    def setSMS(value: js.Tuple5[SEND_SMS, RECEIVE_SMS, READ_SMS, RECEIVE_WAP_PUSH, RECEIVE_MMS]): Self = this.set("SMS", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTORAGE(value: js.Tuple2[READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE]): Self = this.set("STORAGE", value.asInstanceOf[js.Any])
  }
  
}

